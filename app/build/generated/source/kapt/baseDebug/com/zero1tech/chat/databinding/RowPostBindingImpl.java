package com.zero1tech.chat.databinding;
import com.zero1tech.chat.R;
import com.zero1tech.chat.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowPostBindingImpl extends RowPostBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.row_iv_menu, 10);
        sViewsWithIds.put(R.id.row_gray_line, 11);
        sViewsWithIds.put(R.id.btn_share, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowPostBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private RowPostBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , (android.view.View) bindings[11]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            );
        this.btnLike.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rowImageView.setTag(null);
        this.rowLikeCount.setTag(null);
        this.rowPostContent.setTag(null);
        this.rowShareCount.setTag(null);
        this.rowShareCountView.setTag(null);
        this.rowTextViewDate.setTag(null);
        this.rowTextViewPostTitle.setTag(null);
        this.tvLikeCount.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.post == variableId) {
            setPost((com.example.data.model.Post) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPost(@Nullable com.example.data.model.Post Post) {
        this.mPost = Post;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.post);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Boolean postLikeIsVisible = null;
        int postLikeIsVisibleViewVISIBLEViewGONE = 0;
        java.lang.Boolean postIsChecked = null;
        java.lang.String postMessage = null;
        java.lang.String postTitle = null;
        java.lang.Integer postLikeCount = null;
        int postShareIsVisibleViewVISIBLEViewGONE = 0;
        com.example.data.model.Post post = mPost;
        boolean androidxDatabindingViewDataBindingSafeUnboxPostShareIsVisible = false;
        java.lang.String postDate = null;
        int postLikeIsVisibleViewVISIBLEViewINVISIBLE = 0;
        java.lang.Integer postShareCount = null;
        java.lang.String postLikeCountToString = null;
        java.lang.Boolean postShareIsVisible = null;
        java.lang.String postImage = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPostLikeIsVisible = false;
        java.lang.String postShareCountToString = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPostIsChecked = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (post != null) {
                    // read post.likeIsVisible
                    postLikeIsVisible = post.getLikeIsVisible();
                    // read post.isChecked()
                    postIsChecked = post.isChecked();
                    // read post.message
                    postMessage = post.getMessage();
                    // read post.title
                    postTitle = post.getTitle();
                    // read post.likeCount
                    postLikeCount = post.getLikeCount();
                    // read post.date
                    postDate = post.getDate();
                    // read post.shareCount
                    postShareCount = post.getShareCount();
                    // read post.shareIsVisible
                    postShareIsVisible = post.getShareIsVisible();
                    // read post.image
                    postImage = post.getImage();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(post.likeIsVisible)
                androidxDatabindingViewDataBindingSafeUnboxPostLikeIsVisible = androidx.databinding.ViewDataBinding.safeUnbox(postLikeIsVisible);
                // read androidx.databinding.ViewDataBinding.safeUnbox(post.isChecked())
                androidxDatabindingViewDataBindingSafeUnboxPostIsChecked = androidx.databinding.ViewDataBinding.safeUnbox(postIsChecked);
                // read androidx.databinding.ViewDataBinding.safeUnbox(post.shareIsVisible)
                androidxDatabindingViewDataBindingSafeUnboxPostShareIsVisible = androidx.databinding.ViewDataBinding.safeUnbox(postShareIsVisible);
            if((dirtyFlags & 0x3L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPostLikeIsVisible) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPostShareIsVisible) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
                if (postLikeCount != null) {
                    // read post.likeCount.toString()
                    postLikeCountToString = postLikeCount.toString();
                }
                if (postShareCount != null) {
                    // read post.shareCount.toString()
                    postShareCountToString = postShareCount.toString();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(post.likeIsVisible) ? View.VISIBLE : View.GONE
                postLikeIsVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxPostLikeIsVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(post.likeIsVisible) ? View.VISIBLE : View.INVISIBLE
                postLikeIsVisibleViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxPostLikeIsVisible) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(post.shareIsVisible) ? View.VISIBLE : View.GONE
                postShareIsVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxPostShareIsVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.zero1tech.chat.common.AdapterBindingKt.setDrawableStart(this.btnLike, androidxDatabindingViewDataBindingSafeUnboxPostIsChecked);
            com.zero1tech.chat.common.AdapterBindingKt.setImageURI(this.rowImageView, postImage);
            this.rowLikeCount.setVisibility(postLikeIsVisibleViewVISIBLEViewINVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rowPostContent, postMessage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rowShareCount, postShareCountToString);
            this.rowShareCount.setVisibility(postShareIsVisibleViewVISIBLEViewGONE);
            this.rowShareCountView.setVisibility(postShareIsVisibleViewVISIBLEViewGONE);
            com.zero1tech.chat.common.AdapterBindingKt.simpleDateFormat(this.rowTextViewDate, postDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rowTextViewPostTitle, postTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLikeCount, postLikeCountToString);
            this.tvLikeCount.setVisibility(postLikeIsVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): post
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(post.likeIsVisible) ? View.VISIBLE : View.GONE
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(post.likeIsVisible) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(post.shareIsVisible) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(post.shareIsVisible) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(post.likeIsVisible) ? View.VISIBLE : View.INVISIBLE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(post.likeIsVisible) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}