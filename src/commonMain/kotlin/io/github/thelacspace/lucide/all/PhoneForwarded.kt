package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PhoneForwarded") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 6f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 2f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.832f, 16.568f)
                arcToRelative(1f, 1f, 0f, false, false, 1.213f, -.303f)
                lineToRelative(.355f, -.465f)
                arcTo(2f, 2f, 0f, false, true, 17f, 15f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                arcTo(18f, 18f, 0f, false, true, 2f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -.8f, 1.6f)
                lineToRelative(-.468f, .351f)
                arcToRelative(1f, 1f, 0f, false, false, -.292f, 1.233f)
                arcToRelative(14f, 14f, 0f, false, false, 6.392f, 6.384f)
            }
}

public val LucideIcons.All.PhoneForwardedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PhoneForwarded: ImageVector
    @Composable get() = PhoneForwardedDefinition.asImageVector()
