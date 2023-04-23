package com.zero1tech.chat.databinding;
import com.zero1tech.chat.R;
import com.zero1tech.chat.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowRoomsBindingImpl extends RowRoomsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowRoomsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RowRoomsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            );
        this.btnJoin.setTag(null);
        this.clView.setTag(null);
        this.ivProfileRoom.setTag(null);
        this.tvLastMessage.setTag(null);
        this.tvNameRoom.setTag(null);
        this.tvTimeLastMessage.setTag(null);
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
            setModel((com.example.data.model.RoomModel) variable);
        }
        else if (BR.seeIt == variableId) {
            setSeeIt((java.lang.Boolean) variable);
        }
        else if (BR.isJoined == variableId) {
            setIsJoined((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.data.model.RoomModel Model) {
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
    public void setIsJoined(@Nullable java.lang.Boolean IsJoined) {
        this.mIsJoined = IsJoined;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isJoined);
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
        com.example.data.model.RoomModel model = mModel;
        java.lang.String modelLastMassageMessage = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsJoined = false;
        java.lang.String modelIcon = null;
        int isJoinedViewVISIBLEViewGONE = 0;
        java.lang.Boolean seeIt = mSeeIt;
        com.example.data.model.LastMessage modelLastMassage = null;
        java.lang.String modelName = null;
        java.lang.Boolean isJoined = mIsJoined;
        int isJoinedViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxSeeIt = false;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.icon
                    modelIcon = model.getIcon();
                    // read model.lastMassage
                    modelLastMassage = model.getLastMassage();
                    // read model.name
                    modelName = model.getName();
                }


                if (modelLastMassage != null) {
                    // read model.lastMassage.message
                    modelLastMassageMessage = modelLastMassage.getMessage();
                }
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(seeIt)
                androidxDatabindingViewDataBindingSafeUnboxSeeIt = androidx.databinding.ViewDataBinding.safeUnbox(seeIt);
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isJoined)
                androidxDatabindingViewDataBindingSafeUnboxIsJoined = androidx.databinding.ViewDataBinding.safeUnbox(isJoined);
            if((dirtyFlags & 0xcL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsJoined) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isJoined) ? View.VISIBLE : View.GONE
                isJoinedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsJoined) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isJoined) ? View.GONE : View.VISIBLE
                isJoinedViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxIsJoined) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.btnJoin.setVisibility(isJoinedViewVISIBLEViewGONE);
            this.tvTimeLastMessage.setVisibility(isJoinedViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.example.core.util.BindingAdapterKt.setImageUrl(this.ivProfileRoom, modelIcon);
            com.zero1tech.chat.common.AdapterBindingKt.textWithSayHi(this.tvLastMessage, modelLastMassageMessage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvNameRoom, modelName);
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
        flag 2 (0x3L): isJoined
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isJoined) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isJoined) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isJoined) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(isJoined) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}