package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Church") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 9f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 9f)
                lineToRelative(3.52f, 2.147f)
                arcToRelative(1f, 1f, 0f, false, true, .48f, .854f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-6.999f)
                arcToRelative(1f, 1f, 0f, false, true, .48f, -.854f)
                lineTo(6f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 21f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, .376f, -.782f)
                lineToRelative(5f, -3.999f)
                arcToRelative(1f, 1f, 0f, false, true, 1.249f, .001f)
                lineToRelative(5f, 4f)
                arcTo(1f, 1f, 0f, false, true, 18f, 7f)
                verticalLineToRelative(14f)
            }
}

public val LucideIcons.All.ChurchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Church: ImageVector
    @Composable get() = ChurchDefinition.asImageVector()
