package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SlidersVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 8f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 21f)
                verticalLineToRelative(-9f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 16f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 12f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 21f)
                verticalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 14f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 10f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                verticalLineToRelative(-7f)
            }
}

public val LucideIcons.All.SlidersVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SlidersVertical: ImageVector
    @Composable get() = SlidersVerticalDefinition.asImageVector()
