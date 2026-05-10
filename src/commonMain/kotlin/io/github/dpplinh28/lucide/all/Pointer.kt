package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pointer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 14f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 11f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 10f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 9.5f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 11f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.8f, 0f, -4.5f, -.86f, -5.99f, -2.34f)
                lineToRelative(-3.6f, -3.6f)
                arcToRelative(2f, 2f, 0f, false, true, 2.83f, -2.82f)
                lineTo(7f, 15f)
            }
}

public val LucideIcons.All.PointerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pointer: ImageVector
    @Composable get() = PointerDefinition.asImageVector()
