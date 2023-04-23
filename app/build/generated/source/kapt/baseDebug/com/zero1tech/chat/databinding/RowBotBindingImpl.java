package com.zero1tech.chat.databinding;
import com.zero1tech.chat.R;
import com.zero1tech.chat.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowBotBindingImpl extends RowBotBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_profile, 3);
        sViewsWithIds.put(R.id.iv_available, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowBotBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowBotBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.clParent.setTag(null);
        this.tvLastMessage.setTag(null);
        this.tvName.setTag(null);
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
        if (BR.isImagesBut == variableId) {
            setIsImagesBut((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsImagesBut(@Nullable java.lang.Boolean IsImagesBut) {
        this.mIsImagesBut = IsImagesBut;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isImagesBut);
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
        java.lang.String isImagesButTvNameAndroidStringChatImagesTvNameAndroidStringChatBot = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsImagesBut = false;
        java.lang.Boolean isImagesBut = mIsImagesBut;

        if ((dirtyFlags & 0x3L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isImagesBut)
                androidxDatabindingViewDataBindingSafeUnboxIsImagesBut = androidx.databinding.ViewDataBinding.safeUnbox(isImagesBut);
            if((dirtyFlags & 0x3L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsImagesBut) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isImagesBut) ? @android:string/chat_images : @android:string/chat_bot
                isImagesButTvNameAndroidStringChatImagesTvNameAndroidStringChatBot = ((androidxDatabindingViewDataBindingSafeUnboxIsImagesBut) ? (tvName.getResources().getString(R.string.chat_images)) : (tvName.getResources().getString(R.string.chat_bot)));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.zero1tech.chat.common.AdapterBindingKt.styleLastMessage(this.tvLastMessage, false);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, isImagesButTvNameAndroidStringChatImagesTvNameAndroidStringChatBot);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isImagesBut
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(isImagesBut) ? @android:string/chat_images : @android:string/chat_bot
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isImagesBut) ? @android:string/chat_images : @android:string/chat_bot
    flag mapping end*/
    //end
}