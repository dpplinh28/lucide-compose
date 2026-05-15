package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PhoneOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.1f, 13.9f)
                arcToRelative(14f, 14f, 0f, false, false, 3.732f, 2.668f)
                arcToRelative(1f, 1f, 0f, false, false, 1.213f, -.303f)
                lineToRelative(.355f, -.465f)
                arcTo(2f, 2f, 0f, false, true, 17f, 15f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                arcToRelative(18f, 18f, 0f, false, true, -12.728f, -5.272f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.76f, 13.582f)
                arcTo(18f, 18f, 0f, false, true, 2f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -.8f, 1.6f)
                lineToRelative(-.468f, .351f)
                arcToRelative(1f, 1f, 0f, false, false, -.292f, 1.233f)
                arcToRelative(14f, 14f, 0f, false, false, .244f, .473f)
            }
}

public val LucideIcons.All.PhoneOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PhoneOff: ImageVector
    @Composable get() = PhoneOffDefinition.asImageVector()
