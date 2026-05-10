package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GamepadDirectional") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.146f, 15.854f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, 1.708f, 0f)
                lineToRelative(1.56f, 1.56f)
                arcTo(2f, 2f, 0f, false, true, 15f, 18.828f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-2.172f)
                arcToRelative(2f, 2f, 0f, false, true, .586f, -1.414f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.828f, 15f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -.586f)
                lineToRelative(-1.56f, -1.56f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, 0f, -1.708f)
                lineToRelative(1.56f, -1.56f)
                arcTo(2f, 2f, 0f, false, true, 18.828f, 9f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.586f, 14.414f)
                arcTo(2f, 2f, 0f, false, true, 5.172f, 15f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, .586f)
                lineToRelative(1.56f, 1.56f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, 0f, 1.708f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, false, true, -.586f, 1.414f)
                lineToRelative(-1.56f, 1.56f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, -1.708f, 0f)
                lineToRelative(-1.56f, -1.56f)
                arcTo(2f, 2f, 0f, false, true, 9f, 5.172f)
                close()
            }
}

public val LucideIcons.All.GamepadDirectionalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GamepadDirectional: ImageVector
    @Composable get() = GamepadDirectionalDefinition.asImageVector()
