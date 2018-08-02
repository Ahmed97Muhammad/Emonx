package com.allandroidprojects.ecomsample.product;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.fragments.ImageListFragment;
import com.allandroidprojects.ecomsample.fragments.ViewPagerActivity;
import com.allandroidprojects.ecomsample.notification.NotificationCountSetClass;
import com.allandroidprojects.ecomsample.options.CartListActivity;
import com.allandroidprojects.ecomsample.startup.MainActivity;
import com.allandroidprojects.ecomsample.utility.ImageUrlUtils;
import com.allandroidprojects.ecomsample.utility.PostRequestHandler;
import com.facebook.drawee.view.SimpleDraweeView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ItemDetailsActivity extends AppCompatActivity {
    int imagePosition;
    String stringImageUri;
    String stringName;
    String stringDesc;
    String stringPrice;
    String stringUserID;
    String stringGender;
    String stringEmotion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        SimpleDraweeView mImageView = (SimpleDraweeView)findViewById(R.id.image1);
        TextView mProductName = (TextView) findViewById(R.id.prod_det_name);
        TextView mProductDesc = (TextView) findViewById(R.id.prod_det_desc);
        TextView mProductPrice = (TextView) findViewById(R.id.prod_det_price);

        TextView textViewAddToCart = (TextView)findViewById(R.id.text_action_bottom1);
        TextView textViewBuyNow = (TextView)findViewById(R.id.text_action_bottom2);

        //Getting image uri from previous screen
        if (getIntent() != null) {
            stringImageUri = getIntent().getStringExtra(ImageListFragment.STRING_IMAGE_URI);
            stringName = getIntent().getStringExtra(ImageListFragment.STRING_PRODUCT_NAME);
            stringDesc = getIntent().getStringExtra(ImageListFragment.STRING_PRODUCT_DESCRIPTION);
            stringPrice = getIntent().getStringExtra(ImageListFragment.STRING_PRODUCT_PRICE);
            imagePosition = getIntent().getIntExtra(ImageListFragment.STRING_POSITION,0);
            stringUserID = getIntent().getStringExtra(ImageListFragment.USER_ID);
            stringGender = getIntent().getStringExtra(ImageListFragment.GENDER);
            stringEmotion = getIntent().getStringExtra(ImageListFragment.EMOTION);
//            imagePosition = getIntent().getIntExtra(ImageListFragment.STRING_IMAGE_URI,0);
        }
        Uri uri = Uri.parse(stringImageUri);
        mImageView.setImageURI(uri);
        mProductName.setText(stringName);
        mProductDesc.setText(stringDesc);
        mProductPrice.setText(stringPrice);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(ItemDetailsActivity.this, ViewPagerActivity.class);
                    intent.putExtra("position", imagePosition);
                    startActivity(intent);

            }
        });

        textViewAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageUrlUtils imageUrlUtils = new ImageUrlUtils();
                imageUrlUtils.addCartListImageUri(stringImageUri);
                Toast.makeText(ItemDetailsActivity.this,"Item added to cart.",Toast.LENGTH_SHORT).show();

                JSONObject activityDataObj = new JSONObject();
                try {
                    activityDataObj.put("ActivityData", MainActivity.activityData);
                    activityDataObj.put("UserID", stringUserID);
                    activityDataObj.put("Gender", stringGender);
                    activityDataObj.put("Emotion", stringEmotion);
                    activityDataObj.put("ProductIndex", imagePosition);
                    activityDataObj.put("ProductName", stringName);
                    activityDataObj.put("FilterKey", "EmonX123");

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                String urlString = getString(R.string.server_url);

                new PostRequestHandler(getApplicationContext()).execute(activityDataObj.toString(), urlString);

                MainActivity.activityData = new JSONArray();
                MainActivity.notificationCountCart++;
                NotificationCountSetClass.setNotifyCount(MainActivity.notificationCountCart);
//                Intent intent = new Intent(ItemDetailsActivity.this, MainActivity.class);
//                startActivity(intent);
            }
        });

        textViewBuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageUrlUtils imageUrlUtils = new ImageUrlUtils();
                imageUrlUtils.addCartListImageUri(stringImageUri);
                MainActivity.notificationCountCart++;
                NotificationCountSetClass.setNotifyCount(MainActivity.notificationCountCart);
                startActivity(new Intent(ItemDetailsActivity.this, CartListActivity.class));

            }
        });

    }
}
