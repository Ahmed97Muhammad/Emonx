/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.allandroidprojects.ecomsample.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.product.ItemDetailsActivity;
import com.allandroidprojects.ecomsample.startup.MainActivity;
import com.allandroidprojects.ecomsample.utility.EmonXGestureListener;
import com.allandroidprojects.ecomsample.utility.ImageUrlUtils;
import com.allandroidprojects.ecomsample.utility.ProductInfoUtils;
import com.facebook.drawee.view.SimpleDraweeView;

import org.w3c.dom.Text;


public class ImageListFragment extends Fragment {

    public static final String USER_ID = "userID";
    public static final String GENDER = "gender";
    public static final String EMOTION = "emotion";
    public static final String STRING_IMAGE_URI = "ImageUri";
    public static final String STRING_POSITION = "ImagePosition";
    public static final String STRING_PRODUCT_NAME = "ProductName";
    public static final String STRING_PRODUCT_DESCRIPTION = "ProductDescription";
    public static final String STRING_PRODUCT_PRICE = "ProductPrice";
    private static MainActivity mActivity;
    private GestureDetector mDetector;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (MainActivity) getActivity();
        mDetector = new GestureDetector(getActivity(), new EmonXGestureListener());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView rv = (RecyclerView) inflater.inflate(R.layout.layout_recylerview_list, container, false);
        setupRecyclerView(rv);
        return rv;
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
      /*  if (ImageListFragment.this.getArguments().getInt("type") == 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        } else if (ImageListFragment.this.getArguments().getInt("type") == 2) {
            StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
        } else {
            GridLayoutManager layoutManager = new GridLayoutManager(recyclerView.getContext(), 3);
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
        }*/
        String[] imageUrls = null;
        String[] itemNames = null;
        String[] itemDescriptions = null;
        String[] itemPrices = null;
        if (ImageListFragment.this.getArguments().getInt("type") == 1) {
            imageUrls = ImageUrlUtils.getSmartphoneUrls();
            itemNames = ProductInfoUtils.getSmartphoneNames();
            itemDescriptions = ProductInfoUtils.getSmartphoneDescriptions();
            itemPrices = ProductInfoUtils.getSmartphonePrices();

        } else if (ImageListFragment.this.getArguments().getInt("type") == 2) {
            imageUrls = ImageUrlUtils.getMensFashionUrls();
            itemNames = ProductInfoUtils.getMensFashionNames();
            itemDescriptions = ProductInfoUtils.getMensFashionDescriptions();
            itemPrices = ProductInfoUtils.getMensFashionPrices();

        } else if (ImageListFragment.this.getArguments().getInt("type") == 3) {
            imageUrls = ImageUrlUtils.getWomensFashionUrls();
            itemNames = ProductInfoUtils.getWomensFashionNames();
            itemDescriptions = ProductInfoUtils.getWomensFashionDescriptions();
            itemPrices = ProductInfoUtils.getWomensFashionPrices();

        } else if (ImageListFragment.this.getArguments().getInt("type") == 4) {
            imageUrls = ImageUrlUtils.getApplianceUrls();
            itemNames = ProductInfoUtils.getApplianceNames();
            itemDescriptions = ProductInfoUtils.getApplianceDescriptions();
            itemPrices = ProductInfoUtils.getAppliancePrices();

        } else if (ImageListFragment.this.getArguments().getInt("type") == 5) {
            imageUrls = ImageUrlUtils.getLaptopUrls();
            itemNames = ProductInfoUtils.getLaptopNames();
            itemDescriptions = ProductInfoUtils.getLaptopDescriptions();
            itemPrices = ProductInfoUtils.getLaptopPrices();

        } else if (ImageListFragment.this.getArguments().getInt("type") == 6) {
            imageUrls = ImageUrlUtils.getMiscUrls();
            itemNames = ProductInfoUtils.getMiscNames();
            itemDescriptions = ProductInfoUtils.getMiscDescriptions();
            itemPrices = ProductInfoUtils.getMiscPrices();

        } else {
//            imageUrls = ImageUrlUtils.getImageUrls();
            imageUrls = ImageUrlUtils.getSmartphoneUrls();
            itemNames = ProductInfoUtils.getSmartphoneNames();
            itemDescriptions = ProductInfoUtils.getSmartphoneDescriptions();
            itemPrices = ProductInfoUtils.getSmartphonePrices();
        }
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new SimpleStringRecyclerViewAdapter(recyclerView,
                imageUrls, itemNames, itemDescriptions, itemPrices));

        recyclerView.setOnTouchListener(touchListener);
    }

    RecyclerView.OnTouchListener touchListener = new RecyclerView.OnTouchListener() {

        @Override
        public boolean onTouch(View view, MotionEvent event) {
            return mDetector.onTouchEvent(event);
        }
    };

    public static class SimpleStringRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleStringRecyclerViewAdapter.ViewHolder> {

        private String[] mImageUrls;
        private String[] mNames;
        private String[] mDescs;
        private String[] mPrices;
        private RecyclerView mRecyclerView;


        public static class ViewHolder extends RecyclerView.ViewHolder {
            public final View mView;
            public final SimpleDraweeView mImageView;

            public final TextView mNameView;
            public final TextView mDescriptionView;
            public final TextView mPriceView;

            public final LinearLayout mLayoutItem;
            public final ImageView mImageViewWishlist;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                mImageView = (SimpleDraweeView) view.findViewById(R.id.image1);

                mNameView = (TextView) view.findViewById(R.id.prod_name);
                mDescriptionView = (TextView) view.findViewById(R.id.prod_desc);
                mPriceView = (TextView) view.findViewById(R.id.prod_price);

                mLayoutItem = (LinearLayout) view.findViewById(R.id.layout_item);
                mImageViewWishlist = (ImageView) view.findViewById(R.id.ic_wishlist);
            }
        }

        public SimpleStringRecyclerViewAdapter(RecyclerView recyclerView,
                                               String[] imageUrls,
                                               String[] itemNames,
                                               String[] itemDescriptions,
                                               String[] itemPrices) {
            mImageUrls = imageUrls;
            mPrices = itemPrices;
            mNames = itemNames;
            mDescs = itemDescriptions;
            mRecyclerView = recyclerView;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onViewRecycled(ViewHolder holder) {
            if (holder.mImageView.getController() != null) {
                holder.mImageView.getController().onDetach();
            }
            if (holder.mImageView.getTopLevelDrawable() != null) {
                holder.mImageView.getTopLevelDrawable().setCallback(null);
//                ((BitmapDrawable) holder.mImageView.getTopLevelDrawable()).getBitmap().recycle();
            }
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
           /* FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) holder.mImageView.getLayoutParams();
            if (mRecyclerView.getLayoutManager() instanceof GridLayoutManager) {
                layoutParams.height = 200;
            } else if (mRecyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                layoutParams.height = 600;
            } else {
                layoutParams.height = 800;
            }*/
            final Uri uri = Uri.parse(mImageUrls[position]);

            final String name = mNames[position];
            final String desc = mDescs[position];
            final String price = mPrices[position];

            holder.mImageView.setImageURI(uri);

            //Set card details here
            holder.mNameView.setText(name);
            holder.mDescriptionView.setText(desc);
            holder.mPriceView.setText(price);


            holder.mLayoutItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String userID = mActivity.getIntent().getStringExtra(USER_ID);
                    String gender = mActivity.getIntent().getStringExtra(GENDER);
                    String emotion = mActivity.getIntent().getStringExtra(EMOTION);
                    Intent intent = new Intent(mActivity, ItemDetailsActivity.class);
                    intent.putExtra(STRING_IMAGE_URI, mImageUrls[position]);
                    intent.putExtra(STRING_PRODUCT_NAME, mNames[position]);
                    intent.putExtra(STRING_PRODUCT_DESCRIPTION, mDescs[position]);
                    intent.putExtra(STRING_PRODUCT_PRICE, mPrices[position]);
                    intent.putExtra(STRING_POSITION, position);
                    intent.putExtra(USER_ID, userID);
                    intent.putExtra(GENDER, gender);
                    intent.putExtra(EMOTION, emotion);
                    mActivity.startActivity(intent);

                }
            });

            //Set click action for wishlist
            holder.mImageViewWishlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ImageUrlUtils imageUrlUtils = new ImageUrlUtils();
                    imageUrlUtils.addWishlistImageUri(mImageUrls[position]);
                    holder.mImageViewWishlist.setImageResource(R.drawable.ic_favorite_black_18dp);
                    notifyDataSetChanged();
                    Toast.makeText(mActivity, "Item added to wishlist.", Toast.LENGTH_SHORT).show();

                }
            });

        }

        @Override
        public int getItemCount() {
            return mImageUrls.length;
        }
    }
}
