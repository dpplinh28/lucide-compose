package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineStyle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 5f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 5f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.LineStyleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineStyle: ImageVector
    @Composable get() = LineStyleDefinition.asImageVector()
