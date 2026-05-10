package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dam") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 11.31f)
                curveToRelative(1.17f, .56f, 1.54f, 1.69f, 3.5f, 1.69f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(1.3f, 0f, 1.9f, .5f, 2.5f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.75f, 18f)
                curveToRelative(.35f, .5f, 1.45f, 1f, 2.75f, 1f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(1.3f, 0f, 1.9f, .5f, 2.5f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 14f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 18f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 6f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                lineTo(10f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
}

public val LucideIcons.All.DamDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dam: ImageVector
    @Composable get() = DamDefinition.asImageVector()
