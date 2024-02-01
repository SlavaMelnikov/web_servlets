package by.melnikov.webservlets.model.dao;

public final class ColumnName {

    /*
    Table of users
     */
    public static final String USERS = "users";
    public static final String USER_ID = "user_id";
    public static final String USER_LOGIN = "login";
    public static final String USER_PASSWORD = "password";
    public static final String USER_ROLE = "role";
    public static final String USER_STATUS = "status";
    public static final String USER_EMAIL = "email";
    public static final String USER_NAME = "name";
    public static final String USER_LAST_NAME = "last_name";
    public static final String USER_BIRTHDATE = "birthdate";
    public static final String USER_PHONE = "phone";
    public static final String USER_BALANCE = "balance";
    public static final String USER_ORDERS_COUNT = "orders_count";
    public static final String USER_DISCOUNT = "discount";

    /*
    Table of orders
     */
    public static final String ORDER_ID = "order_id";
    public static final String ORDER_USER_ID = "user_id";
    public static final String ORDER_BIKE_NUMBER = "bike_number";
    public static final String ORDER_START_TIME = "start_time";
    public static final String ORDER_END_TIME = "end_time";
    public static final String ORDER_PRICE = "price";

    /*
    Table of bikes
     */
    public static final String BIKE_NUMBER = "bike_number";
    public static final String BIKE_MODEL = "model";
    public static final String BIKE_TYPE = "type";
    public static final String BIKE_STATUS = "status";
    public static final String BIKE_PARKING_POINT = "parking_point";

    /*
    Table of parking points
     */
    public static final String PARKING_POINT_ID = "parking_point_id";
    public static final String PARKING_POINT_CITY = "city";
    public static final String PARKING_POINT_STREET = "street";
    public static final String PARKING_POINT_BUILDING_NUMBER = "building_number";
    public static final String PARKING_POINT_STATUS = "status";

    /*
    Table of feedbacks
     */
    public static final String FEEDBACK_ORDER_ID = "order_id";
    public static final String FEEDBACK_STARS = "stars";
    public static final String FEEDBACK_REVIEW = "review";


    /*
    Table of payment cards
     */
    public static final String CARD_HOLDER_ID = "user_id";
    public static final String CARD_NUMBER = "card_number";
    public static final String CARD_OWNER = "owner";
    public static final String CARD_EXPIRED_DATE = "expired_date";
    public static final String CARD_BANK = "bank";

    private ColumnName() {
    }
}
