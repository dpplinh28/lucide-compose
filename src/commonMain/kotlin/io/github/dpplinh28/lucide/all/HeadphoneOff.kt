package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeadphoneOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 14f)
                horizontalLineToRelative(-1.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.128f, 3.47f)
                arcTo(9f, 9f, 0f, false, true, 21f, 12f)
                verticalLineToRelative(3.343f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.414f, 20.414f)
                arcTo(2f, 2f, 0f, false, true, 19f, 21f)
                horizontalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 14f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-7f)
                arcToRelative(9f, 9f, 0f, false, true, 2.636f, -6.364f)
            }
}

public val LucideIcons.All.HeadphoneOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeadphoneOff: ImageVector
    @Composable get() = HeadphoneOffDefinition.asImageVector()
