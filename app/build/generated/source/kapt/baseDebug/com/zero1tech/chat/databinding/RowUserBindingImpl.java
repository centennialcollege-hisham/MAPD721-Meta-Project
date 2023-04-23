package com.zero1tech.chat.databinding;
import com.zero1tech.chat.R;
import com.zero1tech.chat.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowUserBindingImpl extends RowUserBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_date_last_message, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RowUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.clParent.setTag(null);
        this.ivAvailable.setTag(null);
        this.ivProfile.setTag(null);
        this.tvLastMessage.setTag(null);
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.model == variableId) {
            setModel((com.example.data.model.UserRemote) variable);
        }
        else if (BR.seeIt == variableId) {
            setSeeIt((java.lang.Boolean) variable);
        }
        else if (BR.isJoin == variableId) {
            setIsJoin((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.data.model.UserRemote Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setSeeIt(@Nullable java.lang.Boolean SeeIt) {
        this.mSeeIt = SeeIt;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.seeIt);
        super.requestRebind();
    }
    public void setIsJoin(@Nullable java.lang.Boolean IsJoin) {
        this.mIsJoin = IsJoin;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isJoin);
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
        com.example.data.model.UserRemote model = mModel;
        java.lang.String modelLastMessage = null;
        java.lang.String modelProfile = null;
        java.lang.Boolean seeIt = mSeeIt;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsJoin = false;
        java.lang.Boolean isJoin = mIsJoin;
        java.lang.String modelFullName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSeeIt = false;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.lastMessage
                    modelLastMessage = model.getLastMessage();
                    // read model.profile
                    modelProfile = model.getProfile();
                    // read model.fullName
                    modelFullName = model.getFullName();
                }
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(seeIt)
                androidxDatabindingViewDataBindingSafeUnboxSeeIt = androidx.databinding.ViewDataBinding.safeUnbox(seeIt);
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isJoin)
                androidxDatabindingViewDataBindingSafeUnboxIsJoin = androidx.databinding.ViewDataBinding.safeUnbox(isJoin);
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.zero1tech.chat.common.AdapterBindingKt.setJoinDot(this.ivAvailable, androidxDatabindingViewDataBindingSafeUnboxIsJoin);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.example.core.util.BindingAdapterKt.setImageUrl(this.ivProfile, modelProfile);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLastMessage, modelLastMessage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, modelFullName);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.zero1tech.chat.common.AdapterBindingKt.styleLastMessage(this.tvLastMessage, androidxDatabindingViewDataBindingSafeUnboxSeeIt);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): seeIt
        flag 2 (0x3L): isJoin
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}