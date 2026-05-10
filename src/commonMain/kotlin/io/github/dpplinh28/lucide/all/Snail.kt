package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Snail") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 13f)
                arcToRelative(6f, 6f, 0f, true, false, 12f, 0f)
                arcToRelative(4f, 4f, 0f, true, false, -8f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 13.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                horizontalLineToRelative(12f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 3f)
                lineTo(19.1f, 5.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 3f)
                lineTo(20.9f, 5.2f)
            }
}

public val LucideIcons.All.SnailDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Snail: ImageVector
    @Composable get() = SnailDefinition.asImageVector()
