package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Frame") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 6f)
                lineTo(2f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 18f)
                lineTo(2f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 2f)
                lineTo(6f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 2f)
                lineTo(18f, 22f)
            }
}

public val LucideIcons.All.FrameDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Frame: ImageVector
    @Composable get() = FrameDefinition.asImageVector()
