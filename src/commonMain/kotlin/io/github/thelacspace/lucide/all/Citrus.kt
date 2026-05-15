package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Citrus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.66f, 17.67f)
                arcToRelative(1.08f, 1.08f, 0f, false, true, -.04f, 1.6f)
                arcTo(12f, 12f, 0f, false, true, 4.73f, 2.38f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, 1.61f, -.04f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(19.65f, 15.66f)
                arcTo(8f, 8f, 0f, false, true, 8.35f, 4.34f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 10f)
                lineToRelative(-5.5f, 5.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 17.85f)
                verticalLineTo(10f)
                horizontalLineTo(6.15f)
            }
}

public val LucideIcons.All.CitrusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Citrus: ImageVector
    @Composable get() = CitrusDefinition.asImageVector()
