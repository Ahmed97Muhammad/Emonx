package com.allandroidprojects.ecomsample.utility;

import java.util.ArrayList;

/**
 * Created by 06peng on 2015/6/24.
 */
public class ImageUrlUtils {
    static ArrayList<String> wishlistImageUri = new ArrayList<>();
    static ArrayList<String> cartListImageUri = new ArrayList<>();

    public static String[] getImageUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/5854/sea-woman-legs-water-medium.jpg",
                "https://static.pexels.com/photos/6245/kitchen-cooking-interior-decor-medium.jpg",
                "https://static.pexels.com/photos/6770/light-road-lights-night-medium.jpg",
                "https://static.pexels.com/photos/6041/nature-grain-moving-cereal-medium.jpg",
                "https://static.pexels.com/photos/7116/mountains-water-trees-lake-medium.jpg",
                "https://static.pexels.com/photos/6601/food-plate-yellow-white-medium.jpg",
                "https://static.pexels.com/photos/6695/summer-sun-yellow-spring-medium.jpg",
                "https://static.pexels.com/photos/7117/mountains-night-clouds-lake-medium.jpg",
                "https://static.pexels.com/photos/7262/clouds-ocean-seagull-medium.jpg",
                "https://static.pexels.com/photos/5968/wood-nature-dark-forest-medium.jpg",
                "https://static.pexels.com/photos/6101/hands-woman-art-hand-medium.jpg",
                "https://static.pexels.com/photos/6571/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/6740/food-sugar-lighting-milk-medium.jpg",
                "https://static.pexels.com/photos/5659/sky-sunset-clouds-field-medium.jpg",
                "https://static.pexels.com/photos/6945/sunset-summer-golden-hour-paul-filitchkin-medium.jpg",
                "https://static.pexels.com/photos/6151/animal-cute-fur-white-medium.jpg",
                "https://static.pexels.com/photos/5696/coffee-cup-water-glass-medium.jpg",
                "https://static.pexels.com/photos/6789/flowers-petals-gift-flower-medium.jpg",
                "https://static.pexels.com/photos/7202/summer-trees-sunlight-trail-medium.jpg",
                "https://static.pexels.com/photos/7147/night-clouds-summer-trees-medium.jpg",
                "https://static.pexels.com/photos/6342/woman-notebook-working-girl-medium.jpg",
                "https://static.pexels.com/photos/5998/sky-love-people-romantic-medium.jpg",
                "https://static.pexels.com/photos/6872/cold-snow-nature-weather-medium.jpg",
                "https://static.pexels.com/photos/7045/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/6923/mountains-fog-green-beauty-medium.jpg",
                "https://static.pexels.com/photos/6946/summer-bicycle-letsride-paul-filitchkin-medium.jpg",
                "https://static.pexels.com/photos/5650/sky-clouds-field-blue-medium.jpg",
                "https://static.pexels.com/photos/6292/blue-pattern-texture-macro-medium.jpg",
                "https://static.pexels.com/photos/6080/grass-lawn-technology-tablet-medium.jpg",
                "https://static.pexels.com/photos/7124/clouds-trees-medium.jpg",
                "https://static.pexels.com/photos/5923/woman-girl-teenager-wine-medium.jpg",
                "https://static.pexels.com/photos/6133/food-polish-cooking-making-medium.jpg",
                "https://static.pexels.com/photos/6224/hands-people-woman-working-medium.jpg",
                "https://static.pexels.com/photos/6414/rucola-young-argula-sproutus-medium.jpg",
                "https://static.pexels.com/photos/6739/art-graffiti-abstract-vintage-medium.jpg",
                "https://static.pexels.com/photos/6703/city-train-metal-public-transportation-medium.jpg",
                "https://static.pexels.com/photos/6851/man-love-woman-kiss-medium.jpg",
                "https://static.pexels.com/photos/6225/black-scissors-medium.jpg",
                "https://static.pexels.com/photos/7185/night-clouds-trees-stars-medium.jpg",
                "https://static.pexels.com/photos/5847/fashion-woman-girl-jacket-medium.jpg",
                "https://static.pexels.com/photos/5542/vintage-railroad-tracks-bw-medium.jpg",
                "https://static.pexels.com/photos/5938/food-salad-healthy-lunch-medium.jpg",
                "https://static.pexels.com/photos/7234/water-clouds-ocean-splash-medium.jpg",
                "https://static.pexels.com/photos/6418/flowers-flower-roses-rose-medium.jpg",
                "https://static.pexels.com/photos/6436/spring-flower-hyacinth-medium.jpg",
                "https://static.pexels.com/photos/6351/smartphone-desk-laptop-technology-medium.jpg",
                "https://static.pexels.com/photos/5618/fish-fried-mint-pepper-medium.jpg",
                "https://static.pexels.com/photos/6874/landscape-nature-water-rocks-medium.jpg",
                "https://static.pexels.com/photos/6918/bridge-fog-san-francisco-lets-get-lost-medium.jpg",
                "https://static.pexels.com/photos/5658/light-sunset-red-flowers-medium.jpg",
                "https://static.pexels.com/photos/6111/smartphone-friends-internet-connection-medium.jpg",
                "https://static.pexels.com/photos/5670/wood-fashion-black-stylish-medium.jpg",
                "https://static.pexels.com/photos/5838/hands-woman-hand-typing-medium.jpg",
                "https://static.pexels.com/photos/7050/sky-clouds-skyline-blue-medium.jpg",
                "https://static.pexels.com/photos/6036/nature-forest-tree-bark-medium.jpg",
                "https://static.pexels.com/photos/5676/art-camera-photography-picture-medium.jpg",
                "https://static.pexels.com/photos/6688/beach-sand-blue-ocean-medium.jpg",
                "https://static.pexels.com/photos/6901/sunset-clouds-golden-hour-lets-get-lost-medium.jpg",
                "https://static.pexels.com/photos/7260/rocks-fire-camping-medium.jpg",
                "https://static.pexels.com/photos/5672/dog-cute-adorable-play-medium.jpg",
                "https://static.pexels.com/photos/7261/rocks-trees-hiking-trail-medium.jpg",
                "https://static.pexels.com/photos/6411/smartphone-girl-typing-phone-medium.jpg",
                "https://static.pexels.com/photos/6412/table-white-home-interior-medium.jpg",
                "https://static.pexels.com/photos/6184/technology-keyboard-desktop-book-medium.jpg",
                "https://static.pexels.com/photos/7295/controller-xbox-gaming-medium.jpg",
                "https://static.pexels.com/photos/6732/city-cars-traffic-lights-medium.jpg",
                "https://static.pexels.com/photos/7160/bird-trees-medium.jpg",
                "https://static.pexels.com/photos/6999/red-hand-summer-berries-medium.jpg",
                "https://static.pexels.com/photos/5787/flowers-meadow-spring-green-medium.jpg",
                "https://static.pexels.com/photos/7136/water-rocks-stream-leaves-medium.jpg",
                "https://static.pexels.com/photos/7291/building-historical-church-religion-medium.jpg",
                "https://static.pexels.com/photos/6696/road-nature-summer-forest-medium.jpg",
                "https://static.pexels.com/photos/7294/garden-medium.jpg",
                "https://static.pexels.com/photos/6948/flight-sky-art-clouds-medium.jpg",
                "https://static.pexels.com/photos/7299/africa-animals-zoo-zebras-medium.jpg",
                "https://static.pexels.com/photos/6345/dark-brown-milk-candy-medium.jpg",
                "https://static.pexels.com/photos/7288/animal-dog-pet-park-medium.jpg",
                "https://static.pexels.com/photos/5863/nature-plant-leaf-fruits-medium.jpg",
                "https://static.pexels.com/photos/6625/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/6708/stairs-people-sitting-architecture-medium.jpg",
                "https://static.pexels.com/photos/6429/smartphone-technology-music-white-medium.jpg",
                "https://static.pexels.com/photos/6574/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/7287/grass-lawn-meadow-medium.jpg",
                "https://static.pexels.com/photos/6100/man-hands-holidays-looking-medium.jpg",
                "https://static.pexels.com/photos/6100/man-hands-holidays-looking-medium.jpg",
                "https://static.pexels.com/photos/6877/dog-pet-fur-brown-medium.jpg",
                "https://static.pexels.com/photos/6790/light-road-nature-iphone-medium.jpg",
                "https://static.pexels.com/photos/7077/man-people-office-writing-medium.jpg",
                "https://static.pexels.com/photos/6889/light-mountains-sunrise-california-medium.jpg",
                "https://static.pexels.com/photos/7274/leaf-fall-foliage-medium.jpg",
                "https://static.pexels.com/photos/7285/flowers-garden-medium.jpg",
                "https://static.pexels.com/photos/6821/light-sky-beach-sand-medium.jpg",
                "https://static.pexels.com/photos/7297/animal-africa-giraffe-medium.jpg",
                "https://static.pexels.com/photos/6154/sea-sky-water-clouds-medium.jpg",
                "https://static.pexels.com/photos/7059/man-people-space-desk-medium.jpg",
                "https://static.pexels.com/photos/6666/coffee-cup-mug-apple-medium.jpg",
                "https://static.pexels.com/photos/5949/food-nature-autumn-nuts-medium.jpg",
                "https://static.pexels.com/photos/7064/man-notes-macbook-computer-medium.jpg",
                "https://static.pexels.com/photos/5743/beach-sand-legs-shoes-medium.jpg",
                "https://static.pexels.com/photos/6355/desk-laptop-working-technology-medium.jpg",
                "https://static.pexels.com/photos/5844/sea-water-boats-boat-medium.jpg",
                "https://static.pexels.com/photos/5541/city-night-building-house-medium.jpg",
                "https://static.pexels.com/photos/7017/food-peppers-kitchen-yum-medium.jpg",
                "https://static.pexels.com/photos/5725/grey-luxury-carpet-silver-medium.jpg",
                "https://static.pexels.com/photos/6932/italian-vintage-old-beautiful-medium.jpg",
                "https://static.pexels.com/photos/7093/coffee-desk-notes-workspace-medium.jpg",
        };
        return urls;
    }

    public static String[] getOffersUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg",
                "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg",
                "https://static.pexels.com/photos/1778/numbers-time-watch-white-medium.jpg",
                "https://static.pexels.com/photos/111147/pexels-photo-111147-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg",
                "https://static.pexels.com/photos/213384/pexels-photo-213384-medium.jpeg",
                "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg",
                "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg",
                "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg",
                "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/177143/pexels-photo-177143-medium.jpeg",
                "https://static.pexels.com/photos/106936/pexels-photo-106936-medium.jpeg"
        };
        return urls;
    }

    public static String[] getSmartphoneUrls() {
        String[] urls = new String[]{
                "https://pk.daraz.io/pTl92dOViO0E-BiWc5P4nFIL9QY=/fit-in/220x220/filters:fill(white)/product/36/42607/1.jpg?0656",
                "https://pk.daraz.io/WbH839C5fp-129FMiSG6P4Z67mA=/fit-in/220x220/filters:fill(white)/product/16/02617/1.jpg?3637",
                "https://pk.daraz.io/FmsIERI4gq4T02am66700v7BcO0=/fit-in/220x220/filters:fill(white)/product/40/95756/1.jpg?7412",
                "https://pk.daraz.io/iAceAoZ4Nr8Lugd9K8AjEJ61NdM=/fit-in/220x220/filters:fill(white)/product/50/82846/1.jpg?6318",
                "https://pk.daraz.io/_eYDenT0UfUGTi5HyrSD9muzndk=/fit-in/220x220/filters:fill(white)/product/08/54076/1.jpg?8390",
                "https://pk.daraz.io/4_pfQVKnR0OApe7HYbZXWsO4FqI=/fit-in/220x220/filters:fill(white)/product/40/33207/1.jpg?5538",
                "https://pk.daraz.io/vb6rqNIKdQ5Lpi0fedJHW0lDryw=/fit-in/220x220/filters:fill(white)/product/84/92127/1.jpg?0137"

        };
        return urls;
    }

    public static String[] getMensFashionUrls() {
        String[] urls = new String[]{
                "https://pk.daraz.io/CQBHuT2NSUprv8DmzlP6djC4qGw=/fit-in/220x220/filters:fill(white)/product/84/32586/1.jpg?5913",
                "https://pk.daraz.io/9ScmveECCuZRfVwO3ueq2fjyTBM=/fit-in/220x220/filters:fill(white)/product/96/40707/1.jpg?7042",
                "https://pk.daraz.io/rD1kR3_1At2dlLDUViHYMUtswpI=/fit-in/220x220/filters:fill(white)/product/57/26396/1.jpg?5893",
                "https://pk.daraz.io/9wwdgSGju4HP2_x7zSlMRUvR4Rs=/fit-in/220x220/filters:fill(white)/product/87/31096/1.jpg?4653",
                "https://pk.daraz.io/4kNQjDdzXraWlF4rE4ptNq7x8g4=/fit-in/220x220/filters:fill(white)/product/33/58707/1.jpg?7589",
                "https://pk.daraz.io/rGe7bfHrmser2u4FTa1Ezz13ZWY=/fit-in/220x220/filters:fill(white)/product/42/72617/1.jpg?7843",
                "https://pk.daraz.io/H-KIK6vcbsoA_a7kn5EbIK2VoAY=/fit-in/220x220/filters:fill(white)/product/81/72617/1.jpg?5585",
                "https://pk.daraz.io/RJgyE39orKZ6UXhKaQHTBt-ZFk8=/fit-in/220x220/filters:fill(white)/product/27/40707/1.jpg?7044",
                "https://pk.daraz.io/dYD2-7BOUeiReUgNkuDJPrHSN_4=/fit-in/220x220/filters:fill(white)/product/58/79776/1.jpg?0694",
                "https://pk.daraz.io/cUSpwsK8bHRfHGTXwIBAb6l6aYs=/fit-in/220x220/filters:fill(white)/product/90/90117/1.jpg?5837",
                "https://pk.daraz.io/O533GCkwU7ZH386_ue2rlkMKqxI=/fit-in/220x220/filters:fill(white)/product/23/95566/1.jpg?8041",
                "https://pk.daraz.io/qPiKW_2ff6LfIa-qFVTJD7MVgzI=/fit-in/220x220/filters:fill(white)/product/02/63107/1.jpg?5387",
                "https://pk.daraz.io/l9mUUdf0KuoPjdIVuNNtbnHJvKA=/fit-in/220x220/filters:fill(white)/product/41/28086/1.jpg?3430"
//
//                "https://pk.daraz.io/WbH839C5fp-129FMiSG6P4Z67mA=/fit-in/220x220/filters:fill(white)/product/16/02617/1.jpg?3637",
//                "https://pk.daraz.io/FmsIERI4gq4T02am66700v7BcO0=/fit-in/220x220/filters:fill(white)/product/40/95756/1.jpg?7412",
//                "https://pk.daraz.io/iAceAoZ4Nr8Lugd9K8AjEJ61NdM=/fit-in/220x220/filters:fill(white)/product/50/82846/1.jpg?6318",
//                "https://pk.daraz.io/_eYDenT0UfUGTi5HyrSD9muzndk=/fit-in/220x220/filters:fill(white)/product/08/54076/1.jpg?8390"

        };
        return urls;
    }

    public static String[] getWomensFashionUrls() {
        String[] urls = new String[]{
                "https://pk.daraz.io/RCI_jAoiuuOZkhbtH0tNBw27xsw=/fit-in/220x220/filters:fill(white)/product/03/87996/1.jpg?4459",
                "https://pk.daraz.io/aAaKhXjXrdmZPnpPo-wJtONvIpA=/fit-in/220x220/filters:fill(white)/product/90/92796/1.jpg?4284",
                "https://pk.daraz.io/mW1JP9SxDF3c-_4II9dHYgCmIcE=/fit-in/220x220/filters:fill(white)/product/10/82746/1.jpg?6537",
                "https://pk.daraz.io/SLIqNoHM_wjAgyoXe-PNh9LjASg=/fit-in/220x220/filters:fill(white)/product/54/13217/1.jpg?9468",
                "https://pk.daraz.io/neBehxzOFomQGxEdP49qj-DhCBw=/fit-in/220x220/filters:fill(white)/product/60/21707/1.jpg?1560",
                "https://pk.daraz.io/DWylvdxCCbDprgF3250LlTPdltA=/fit-in/220x220/filters:fill(white)/product/67/54017/1.jpg?7925",
                "https://pk.daraz.io/DKfPsTRImKPDfH07EwUNlkT3UgA=/fit-in/220x220/filters:fill(white)/product/06/36496/1.jpg?7794",
                "https://pk.daraz.io/Ge8j_N9TXRi2LA2ZqVoEOFjw-tI=/fit-in/220x220/filters:fill(white)/product/04/71296/1.jpg?3818",
                "https://pk.daraz.io/yH8faiF7kwQsmLUh5OYLx3AkkJw=/fit-in/220x220/filters:fill(white)/product/44/11776/1.jpg?5311",
                "https://pk.daraz.io/5MXZMQhFM0l58ZF0zbvTrYRzoVc=/fit-in/220x220/filters:fill(white)/product/18/60496/1.jpg?5781",
                "https://pk.daraz.io/NYrgpW7k5g0gFW2HqHqwC9I9qZA=/fit-in/220x220/filters:fill(white)/product/92/13207/1.jpg?8838",
                "https://pk.daraz.io/m0fwFe4_7-jDtwd1hZncY2WJf2E=/fit-in/220x220/filters:fill(white)/product/01/20366/1.jpg?8914",
                "https://pk.daraz.io/SNbMCFL4X6VspuCIo6Sq_1tedDY=/fit-in/220x220/filters:fill(white)/product/02/44366/1.jpg?8936",
                "https://pk.daraz.io/-oINNdKhESKRRn7PA5q3-dt-jVg=/fit-in/220x220/filters:fill(white)/product/37/02646/1.jpg?6528"
//
//                "https://pk.daraz.io/pTl92dOViO0E-BiWc5P4nFIL9QY=/fit-in/220x220/filters:fill(white)/product/36/42607/1.jpg?0656",
//                "https://pk.daraz.io/WbH839C5fp-129FMiSG6P4Z67mA=/fit-in/220x220/filters:fill(white)/product/16/02617/1.jpg?3637",
//                "https://pk.daraz.io/FmsIERI4gq4T02am66700v7BcO0=/fit-in/220x220/filters:fill(white)/product/40/95756/1.jpg?7412",
//                "https://pk.daraz.io/iAceAoZ4Nr8Lugd9K8AjEJ61NdM=/fit-in/220x220/filters:fill(white)/product/50/82846/1.jpg?6318",
//                "https://pk.daraz.io/_eYDenT0UfUGTi5HyrSD9muzndk=/fit-in/220x220/filters:fill(white)/product/08/54076/1.jpg?8390"

        };
        return urls;
    }

    public static String[] getApplianceUrls() {
        String[] urls = new String[]{
                "https://pk.daraz.io/wZ06ioxhWXj8KBWrea1J1KhiJ4E=/fit-in/220x220/filters:fill(white)/product/50/97617/1.jpg?8279",
                "https://pk.daraz.io/Nvl_zhPZu-qm23fQ37EhbdI7JNA=/fit-in/220x220/filters:fill(white)/product/45/77617/1.jpg?6638",
                "https://pk.daraz.io/VX-cKudLOv6TUOvnyxGikOl-Ags=/fit-in/220x220/filters:fill(white)/product/55/94307/1.jpg?7209",
                "https://pk.daraz.io/gAXpqoC1a5z4cNu88tO3nVueqdA=/fit-in/220x220/filters:fill(white)/product/23/14685/1.jpg?1097",
                "https://pk.daraz.io/acW-xk6Au1U75bBj3GqwDSfbjJ0=/fit-in/220x220/filters:fill(white)/product/82/67617/1.jpg?6638",
                "https://pk.daraz.io/5KXsDI59Z8VTKuwraXtJMktve88=/fit-in/220x220/filters:fill(white)/product/65/42246/1.jpg?0722",
                "https://pk.daraz.io/4EJSWzoMXKKRjpL734-rzyGchhA=/fit-in/220x220/filters:fill(white)/product/66/80366/1.jpg?1073",
                "https://pk.daraz.io/wZdXFwASKLu6S0stL2DQur_QhLM=/fit-in/220x220/filters:fill(white)/product/45/94646/1.jpg?8265",
                "https://pk.daraz.io/RU99AzVYaTFb3H1hapVHLhb8GtQ=/fit-in/220x220/filters:fill(white)/product/35/51656/1.jpg?9407",
                "https://pk.daraz.io/ooGMel0ue5IuSsZuAwal8a-BgKc=/fit-in/220x220/filters:fill(white)/product/56/01096/2.jpg?7029",
                "https://pk.daraz.io/brjQTun0BhaP-SyIkPmkJ9sOgRc=/fit-in/220x220/filters:fill(white)/product/49/34556/1.jpg?1643",
                "https://pk.daraz.io/OoXR0ehqwRB3tBK-FY5LkyXP51k=/fit-in/220x220/filters:fill(white)/product/27/75596/1.jpg?8483",
                "https://pk.daraz.io/_LgBcxypkHCiIAADyiOxQMrzWcI=/fit-in/220x220/filters:fill(white)/product/60/96476/1.jpg?6852",
                "https://pk.daraz.io/GXwgQBd7OCcuuzWUVrJxLTTI4Ho=/fit-in/220x220/filters:fill(white)/product/35/84506/1.jpg?2122"
//

        };
        return urls;
    }

    public static String[] getLaptopUrls() {
        String[] urls = new String[]{
                "https://pk.daraz.io/EGABsIHYxPaCjQEQZdU4yeSHGzo=/fit-in/220x220/filters:fill(white)/product/45/41217/1.jpg?0528",
                "https://pk.daraz.io/sr5kryp4ijhnxUw3fvBoI3cH5Yo=/fit-in/220x220/filters:fill(white)/product/43/94066/1.jpg?8366",
                "https://pk.daraz.io/vvY1tO2pBIvXi_V_l7hEd5ybr5s=/fit-in/220x220/filters:fill(white)/product/22/97117/1.jpg?9076",
                "https://pk.daraz.io/NvigthKImUYoj23aqmzOlBJrTT0=/fit-in/220x220/filters:fill(white)/product/98/87317/1.jpg?6725",
                "https://pk.daraz.io/eOAJ0H6_2ACW3hjwXf0eKqigosE=/fit-in/220x220/filters:fill(white)/product/52/77217/1.jpg?9100",
                "https://pk.daraz.io/oFZYVFqfidDNFuKf7uvf_boWmRs=/fit-in/220x220/filters:fill(white)/product/77/14317/1.jpg?0672",
                "https://pk.daraz.io/9sXjBmz8Bckwd05XZCPwZa8OCrU=/fit-in/220x220/filters:fill(white)/product/10/13696/1.jpg?7214",
                "https://pk.daraz.io/nl0NNw_6x9LMC7xlqbZl9NmvroQ=/fit-in/220x220/filters:fill(white)/product/68/84556/1.jpg?1990",
                "https://pk.daraz.io/zXy6qj6h1WiGV8DsXf1F0gvgf5w=/fit-in/220x220/filters:fill(white)/product/45/09846/1.jpg?5262",
                "https://pk.daraz.io/BSH6bS3oPp4w_TJCmdFZkFPb6ZQ=/fit-in/220x220/filters:fill(white)/product/95/58366/1.jpg?8387",
                "https://pk.daraz.io/b-Hv_TRAESmvzN-m7RX--zA2yBA=/fit-in/220x220/filters:fill(white)/product/25/43807/1.jpg?7837",
                "https://pk.daraz.io/szKFe6tSp900jN_h4BbNOOfYcoc=/fit-in/220x220/filters:fill(white)/product/71/47876/1.jpg?6503",
                "https://pk.daraz.io/2fR-2Oq2mNp0JtRdD5hVyMd9_n8=/fit-in/220x220/filters:fill(white)/product/69/07876/1.jpg?9760",
                "https://pk.daraz.io/8zZTMo1-aF_NJAN4N9kHxiK03pY=/fit-in/220x220/filters:fill(white)/product/67/16876/1.jpg?2433",
                "https://pk.daraz.io/SPH-feWyStwC-KaLdX2SqDuxxJI=/fit-in/220x220/filters:fill(white)/product/45/07017/1.jpg?7717",
                "https://pk.daraz.io/-mlmgIKO5fax0A2ZI6kv50EoBHs=/fit-in/220x220/filters:fill(white)/product/91/59596/1.jpg?6770",
                "https://pk.daraz.io/qrYscZUNJSnRQd_MJ0URjCVbPnE=/fit-in/220x220/filters:fill(white)/product/97/79007/1.jpg?7043",
                "https://pk.daraz.io/i9pTV1k4sT4v7fg5mfFmIwvCC5Y=/fit-in/220x220/filters:fill(white)/product/75/86846/1.jpg?6018",
                "https://pk.daraz.io/1i9hbiAHoiYOk_fsFuyO7nX-ZEU=/fit-in/220x220/filters:fill(white)/product/40/13696/1.jpg?7257"

        };
        return urls;
    }



    public static String[] getMiscUrls() {
        String[] urls = new String[]{
                "https://pk.daraz.io/yhB-2qSSa2N3lRy4Q2U326COpQU=/fit-in/220x220/filters:fill(white)/product/29/23886/1.jpg?7650",
                "https://pk.daraz.io/sM00v5hsnFNzPqPS5p4futCAOYs=/fit-in/220x220/filters:fill(white)/product/22/65356/1.jpg?1644",
                "https://pk.daraz.io/14hy_gY4AJFui9p--kWHt3YcsbA=/fit-in/220x220/filters:fill(white)/product/38/65366/1.jpg?5367",
                "https://pk.daraz.io/knxkl3iUxcnrSvrZ1ZttzvvMGQ4=/fit-in/220x220/filters:fill(white)/product/19/88686/1.jpg?5717",
                "https://pk.daraz.io/PWKSnu0yp8_CsyIiK7_R1QGGVFE=/fit-in/220x220/filters:fill(white)/product/57/40486/1.jpg?0047",
                "https://pk.daraz.io/Z56py-eFy5wHDFrXQ8fXQpAowao=/fit-in/220x220/filters:fill(white)/product/34/91956/1.jpg?3414"
        };
        return urls;
    }

    public static String[] getLifeStyleUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/169047/pexels-photo-169047-medium.jpeg",
                "https://static.pexels.com/photos/160826/girl-dress-bounce-nature-160826-medium.jpeg",
                "https://static.pexels.com/photos/1702/bow-tie-businessman-fashion-man-medium.jpg",
                "https://static.pexels.com/photos/35188/child-childrens-baby-children-s-medium.jpg",
                "https://static.pexels.com/photos/70845/girl-model-pretty-portrait-70845-medium.jpeg",
                "https://static.pexels.com/photos/26378/pexels-photo-26378-medium.jpg",
                "https://static.pexels.com/photos/193355/pexels-photo-193355-medium.jpeg",
                "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg",
                "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg",
                "https://static.pexels.com/photos/189857/pexels-photo-189857-medium.jpeg",
                "https://static.pexels.com/photos/157948/model-modelling-attractive-fashion-157948-medium.jpeg",
                "https://static.pexels.com/photos/33608/dog-ice-woman-purple-medium.jpg",
                "https://static.pexels.com/photos/157940/hair-bracelet-beautiful-beauty-157940-medium.jpeg",
                "https://static.pexels.com/photos/35188/child-childrens-baby-children-s-medium.jpg",
                "https://static.pexels.com/photos/70845/girl-model-pretty-portrait-70845-medium.jpeg",
                "https://static.pexels.com/photos/26378/pexels-photo-26378-medium.jpg",
                "https://static.pexels.com/photos/193355/pexels-photo-193355-medium.jpeg",
        };
        return urls;
    }

    public static String[] getBooksUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg",
                "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg",
                "https://static.pexels.com/photos/33283/stack-of-books-vintage-books-book-books-medium.jpg",
                "https://static.pexels.com/photos/205323/pexels-photo-205323-medium.png",
                "https://static.pexels.com/photos/38167/pexels-photo-38167-medium.jpeg",
                "https://static.pexels.com/photos/68562/pexels-photo-68562-medium.jpeg",
                "https://static.pexels.com/photos/34592/pexels-photo-medium.jpg",
                "https://static.pexels.com/photos/1579/hand-notes-holding-things-medium.jpg",
                "https://static.pexels.com/photos/26890/pexels-photo-26890-medium.jpg",
                "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg",
                "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg",
                "https://static.pexels.com/photos/33283/stack-of-books-vintage-books-book-books-medium.jpg",
                "https://static.pexels.com/photos/205323/pexels-photo-205323-medium.png",
                "https://static.pexels.com/photos/38167/pexels-photo-38167-medium.jpeg",
                "https://static.pexels.com/photos/68562/pexels-photo-68562-medium.jpeg",
        };
        return urls;
    }

    // Methods for Wishlist
    public void addWishlistImageUri(String wishlistImageUri) {
        this.wishlistImageUri.add(0, wishlistImageUri);
    }

    public void removeWishlistImageUri(int position) {
        this.wishlistImageUri.remove(position);
    }

    public ArrayList<String> getWishlistImageUri() {
        return this.wishlistImageUri;
    }

    // Methods for Cart
    public void addCartListImageUri(String wishlistImageUri) {
        this.cartListImageUri.add(0, wishlistImageUri);
    }

    public void removeCartListImageUri(int position) {
        this.cartListImageUri.remove(position);
    }

    public ArrayList<String> getCartListImageUri() {
        return this.cartListImageUri;
    }
}
