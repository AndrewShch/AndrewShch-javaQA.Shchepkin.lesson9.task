package domain;

public class Post {
    private String id;
    private String ownerIdPost; // это у меня идентификатор автора записи
    private String imageUrl;
    private int date;
    private String text;
    private boolean canAnchor; /// закрепить запись
    private boolean canDeletePost;
    private boolean canFavourite; ///добавление в закладки.
    private boolean canEdit;
    private boolean canArchive;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    ////добавил из документации
    private String ownerId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private String signerId;
    private int isPinned;
    private boolean isFavorite;
    private boolean markedAsAds;
    private boolean postponed_id;

    /// + getters/setters

}
