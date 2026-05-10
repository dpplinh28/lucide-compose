package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowsUpFromLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(4f, 6f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 17f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 6f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 17f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 21f)
                horizontalLineToRelative(16f)
            }
}

public val LucideIcons.All.ArrowsUpFromLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowsUpFromLine: ImageVector
    @Composable get() = ArrowsUpFromLineDefinition.asImageVector()
