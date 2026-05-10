package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SlidersHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 5f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 19f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 3f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 17f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                horizontalLineToRelative(-9f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 19f)
                horizontalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                horizontalLineToRelative(-7f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 10f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                horizontalLineTo(3f)
            }
}

public val LucideIcons.All.SlidersHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SlidersHorizontal: ImageVector
    @Composable get() = SlidersHorizontalDefinition.asImageVector()
