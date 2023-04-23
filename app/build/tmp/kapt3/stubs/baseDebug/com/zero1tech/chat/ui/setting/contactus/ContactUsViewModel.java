package com.zero1tech.chat.ui.setting.contactus;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/zero1tech/chat/ui/setting/contactus/ContactUsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/data/repoistory/contactus/ContactUsRepository;", "(Lcom/example/data/repoistory/contactus/ContactUsRepository;)V", "getRepository", "()Lcom/example/data/repoistory/contactus/ContactUsRepository;", "contactUs", "", "messageContactUs", "Lcom/example/data/model/ContactUs;", "app_baseDebug"})
public final class ContactUsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.data.repoistory.contactus.ContactUsRepository repository = null;
    
    @javax.inject.Inject()
    public ContactUsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.data.repoistory.contactus.ContactUsRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.repoistory.contactus.ContactUsRepository getRepository() {
        return null;
    }
    
    public final void contactUs(@org.jetbrains.annotations.NotNull()
    com.example.data.model.ContactUs messageContactUs) {
    }
}