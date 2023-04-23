package com.zero1tech.chat.databinding;
import com.zero1tech.chat.R;
import com.zero1tech.chat.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowPeopleBindingImpl extends RowPeopleBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowPeopleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RowPeopleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.ivAvailable.setTag(null);
        this.ivUser.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAge.setTag(null);
        this.tvFrom.setTag(null);
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
    public void setIsJoin(@Nullable java.lang.Boolean IsJoin) {
        this.mIsJoin = IsJoin;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        java.lang.String modelProfile = null;
        java.lang.String modelAge = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsJoin = false;
        java.lang.Boolean isJoin = mIsJoin;
        java.lang.String modelFullName = null;
        java.lang.String modelFrom = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.profile
                    modelProfile = model.getProfile();
                    // read model.age
                    modelAge = model.getAge();
                    // read model.fullName
                    modelFullName = model.getFullName();
                    // read model.from
                    modelFrom = model.getFrom();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isJoin)
                androidxDatabindingViewDataBindingSafeUnboxIsJoin = androidx.databinding.ViewDataBinding.safeUnbox(isJoin);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.zero1tech.chat.common.AdapterBindingKt.setJoinDot(this.ivAvailable, androidxDatabindingViewDataBindingSafeUnboxIsJoin);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.example.core.util.BindingAdapterKt.setImageUrl(this.ivUser, modelProfile);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAge, modelAge);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFrom, modelFrom);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, modelFullName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): isJoin
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}