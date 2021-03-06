package chat.rocket.android.authentication.di

import chat.rocket.android.authentication.presentation.AuthenticationNavigator
import chat.rocket.android.authentication.ui.AuthenticationActivity
import chat.rocket.android.dagger.qualifier.ForAuthentication
import chat.rocket.android.dagger.scope.PerActivity
import dagger.Module
import dagger.Provides

@Module
class AuthenticationModule {

    @Provides
    @PerActivity
    fun provideAuthenticationNavigator(activity: AuthenticationActivity) = AuthenticationNavigator(activity)
}