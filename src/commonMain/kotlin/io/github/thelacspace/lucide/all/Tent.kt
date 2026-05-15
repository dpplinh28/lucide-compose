package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.5f, 21f)
                lineTo(14f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.5f, 21f)
                lineTo(10f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5f, 21f)
                lineTo(12f, 15f)
                lineToRelative(-3.5f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                horizontalLineToRelative(20f)
            }
}

public val LucideIcons.All.TentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tent: ImageVector
    @Composable get() = TentDefinition.asImageVector()
