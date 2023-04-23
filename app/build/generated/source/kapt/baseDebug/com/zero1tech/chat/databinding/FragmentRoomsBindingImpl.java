package com.zero1tech.chat.databinding;
import com.zero1tech.chat.R;
import com.zero1tech.chat.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRoomsBindingImpl extends FragmentRoomsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rv_room_private, 4);
        sViewsWithIds.put(R.id.rv_room_public, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRoomsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentRoomsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ProgressBar) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.tvPrivateRoom.setTag(null);
        this.tvPublicRoom.setTag(null);
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
        if (BR.isProgress == variableId) {
            setIsProgress((java.lang.Boolean) variable);
        }
        else if (BR.isPrivate == variableId) {
            setIsPrivate((java.lang.Boolean) variable);
        }
        else if (BR.isPublic == variableId) {
            setIsPublic((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsProgress(@Nullable java.lang.Boolean IsProgress) {
        this.mIsProgress = IsProgress;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isProgress);
        super.requestRebind();
    }
    public void setIsPrivate(@Nullable java.lang.Boolean IsPrivate) {
        this.mIsPrivate = IsPrivate;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isPrivate);
        super.requestRebind();
    }
    public void setIsPublic(@Nullable java.lang.Boolean IsPublic) {
        this.mIsPublic = IsPublic;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isPublic);
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
        boolean androidxDatabindingViewDataBindingSafeUnboxIsProgress = false;
        java.lang.Boolean isProgress = mIsProgress;
        java.lang.Boolean isPrivate = mIsPrivate;
        int isProgressViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsPublic = false;
        java.lang.Boolean isPublic = mIsPublic;
        int isPrivateViewVISIBLEViewGONE = 0;
        int isPublicViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsPrivate = false;

        if ((dirtyFlags & 0x9L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isProgress)
                androidxDatabindingViewDataBindingSafeUnboxIsProgress = androidx.databinding.ViewDataBinding.safeUnbox(isProgress);
            if((dirtyFlags & 0x9L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsProgress) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isProgress) ? View.VISIBLE : View.GONE
                isProgressViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsProgress) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isPrivate)
                androidxDatabindingViewDataBindingSafeUnboxIsPrivate = androidx.databinding.ViewDataBinding.safeUnbox(isPrivate);
            if((dirtyFlags & 0xaL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsPrivate) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isPrivate) ? View.VISIBLE : View.GONE
                isPrivateViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsPrivate) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isPublic)
                androidxDatabindingViewDataBindingSafeUnboxIsPublic = androidx.databinding.ViewDataBinding.safeUnbox(isPublic);
            if((dirtyFlags & 0xcL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsPublic) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isPublic) ? View.VISIBLE : View.GONE
                isPublicViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsPublic) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.progressBar.setVisibility(isProgressViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.tvPrivateRoom.setVisibility(isPrivateViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.tvPublicRoom.setVisibility(isPublicViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isProgress
        flag 1 (0x2L): isPrivate
        flag 2 (0x3L): isPublic
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isProgress) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isProgress) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isPrivate) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(isPrivate) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(isPublic) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(isPublic) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}