package com.zero1tech.chat.databinding;
import com.zero1tech.chat.R;
import com.zero1tech.chat.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UpdateProfileFragmentBindingImpl extends UpdateProfileFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_label_ago, 7);
        sViewsWithIds.put(R.id.tv_label_from, 8);
        sViewsWithIds.put(R.id.tv_label_name, 9);
        sViewsWithIds.put(R.id.tv_change, 10);
        sViewsWithIds.put(R.id.progress_bar, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UpdateProfileFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private UpdateProfileFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[5]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.ProgressBar) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            );
        this.btnSave.setTag(null);
        this.etName.setTag(null);
        this.fabEditImage.setTag(null);
        this.ivProfile.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAgo.setTag(null);
        this.tvFrom.setTag(null);
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
        else if (BR.clickable == variableId) {
            setClickable((java.lang.Boolean) variable);
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
    public void setClickable(@Nullable java.lang.Boolean Clickable) {
        this.mClickable = Clickable;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickable);
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
        java.lang.String modelGetAgeWithYear = null;
        java.lang.String modelProfile = null;
        java.lang.Boolean clickable = mClickable;
        boolean androidxDatabindingViewDataBindingSafeUnboxClickable = false;
        java.lang.String modelFullName = null;
        java.lang.String modelFrom = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.getAgeWithYear
                    modelGetAgeWithYear = model.getAgeWithYear();
                    // read model.profile
                    modelProfile = model.getProfile();
                    // read model.fullName
                    modelFullName = model.getFullName();
                    // read model.from
                    modelFrom = model.getFrom();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(clickable)
                androidxDatabindingViewDataBindingSafeUnboxClickable = androidx.databinding.ViewDataBinding.safeUnbox(clickable);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.btnSave.setClickable(androidxDatabindingViewDataBindingSafeUnboxClickable);
            this.etName.setClickable(androidxDatabindingViewDataBindingSafeUnboxClickable);
            this.etName.setFocusable(androidxDatabindingViewDataBindingSafeUnboxClickable);
            this.fabEditImage.setClickable(androidxDatabindingViewDataBindingSafeUnboxClickable);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etName, modelFullName);
            com.zero1tech.chat.common.AdapterBindingKt.setImageURI(this.ivProfile, modelProfile);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAgo, modelGetAgeWithYear);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFrom, modelFrom);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): clickable
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}