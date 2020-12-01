package com.unicom.testapp.ui.gallery.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GalleryPhoto(
    val id: String,
    val description: String?,
    val user: UserPhoto,
    val currentUserCollection: CurrentUserCollection
) : Parcelable {
    @Parcelize
    data class UserPhoto(val id: String, val name: String, val username: String?) : Parcelable {
    }

    @Parcelize
    data class CurrentUserCollection(val raw: String, val full: String) : Parcelable {}
}


