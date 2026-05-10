package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Binoculars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 10f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 7f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 21f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-3.851f)
                curveToRelative(0f, -1.39f, -2f, -2.962f, -2f, -4.829f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(11f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 16f)
                lineTo(2f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 21f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-3.851f)
                curveToRelative(0f, -1.39f, 2f, -2.962f, 2f, -4.829f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(11f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 7f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
            }
}

public val LucideIcons.All.BinocularsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Binoculars: ImageVector
    @Composable get() = BinocularsDefinition.asImageVector()
