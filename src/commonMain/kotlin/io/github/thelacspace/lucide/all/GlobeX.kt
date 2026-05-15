package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(16f, 3f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(20f)
                arcTo(10f, 10f, 0f, true, true, 12f, 2f)
                arcToRelative(14.5f, 14.5f, 0f, false, false, 0f, 20f)
                arcToRelative(14.5f, 14.5f, 0f, false, false, 4f, -10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 3f)
                lineToRelative(-5f, 5f)
            }
}

public val LucideIcons.All.GlobeXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeX: ImageVector
    @Composable get() = GlobeXDefinition.asImageVector()
