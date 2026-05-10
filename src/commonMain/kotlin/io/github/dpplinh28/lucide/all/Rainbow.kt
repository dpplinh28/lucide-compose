package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rainbow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 17f)
                arcToRelative(10f, 10f, 0f, false, false, -20f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 17f)
                arcToRelative(6f, 6f, 0f, false, true, 12f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 17f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
            }
}

public val LucideIcons.All.RainbowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rainbow: ImageVector
    @Composable get() = RainbowDefinition.asImageVector()
