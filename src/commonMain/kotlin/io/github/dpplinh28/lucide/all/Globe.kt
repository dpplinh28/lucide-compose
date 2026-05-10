package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Globe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                arcToRelative(14.5f, 14.5f, 0f, false, false, 0f, 20f)
                arcToRelative(14.5f, 14.5f, 0f, false, false, 0f, -20f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(20f)
            }
}

public val LucideIcons.All.GlobeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Globe: ImageVector
    @Composable get() = GlobeDefinition.asImageVector()
