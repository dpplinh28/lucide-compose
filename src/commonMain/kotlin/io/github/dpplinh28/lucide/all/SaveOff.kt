package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SaveOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 13f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 21f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.41f, 20.41f)
                arcTo(2f, 2f, 0f, false, true, 19f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, .59f, -1.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(29.5f, 11.5f)
                reflectiveCurveToRelative(5f, 5f, 4f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 3f)
                horizontalLineToRelative(6.2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.4f, .6f)
                lineToRelative(3.8f, 3.8f)
                arcToRelative(2f, 2f, 0f, false, true, .6f, 1.4f)
                verticalLineTo(15f)
            }
}

public val LucideIcons.All.SaveOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SaveOff: ImageVector
    @Composable get() = SaveOffDefinition.asImageVector()
