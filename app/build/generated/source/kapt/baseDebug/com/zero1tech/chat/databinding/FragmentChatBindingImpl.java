package com.zero1tech.chat.databinding;
import com.zero1tech.chat.R;
import com.zero1tech.chat.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentChatBindingImpl extends FragmentChatBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linear_progress_bar, 4);
        sViewsWithIds.put(R.id.btn_read_more, 5);
        sViewsWithIds.put(R.id.progress, 6);
        sViewsWithIds.put(R.id.rv_chat, 7);
        sViewsWithIds.put(R.id.et_chat_content, 8);
        sViewsWithIds.put(R.id.fab_send, 9);
        sViewsWithIds.put(R.id.iv_emoji, 10);
        sViewsWithIds.put(R.id.progress_bar, 11);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (com.google.android.material.progressindicator.LinearProgressIndicator) bindings[4]
            , (android.widget.ProgressBar) bindings[6]
            , (android.widget.ProgressBar) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            );
        this.imageView.setTag(null);
        this.imageViewClose.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.rootView.setTag(null);
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
        if (BR.showImagePreview == variableId) {
            setShowImagePreview((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShowImagePreview(@Nullable java.lang.Boolean ShowImagePreview) {
        this.mShowImagePreview = ShowImagePreview;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.showImagePreview);
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
        int showImagePreviewViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxShowImagePreview = false;
        java.lang.Boolean showImagePreview = mShowImagePreview;

        if ((dirtyFlags & 0x3L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(showImagePreview)
                androidxDatabindingViewDataBindingSafeUnboxShowImagePreview = androidx.databinding.ViewDataBinding.safeUnbox(showImagePreview);
            if((dirtyFlags & 0x3L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxShowImagePreview) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(showImagePreview) ? View.VISIBLE : View.GONE
                showImagePreviewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxShowImagePreview) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.imageView.setVisibility(showImagePreviewViewVISIBLEViewGONE);
            this.imageViewClose.setVisibility(showImagePreviewViewVISIBLEViewGONE);
            this.mboundView1.setVisibility(showImagePreviewViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): showImagePreview
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(showImagePreview) ? View.VISIBLE : View.GONE
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(showImagePreview) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}