package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PoundSterling") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 7f)
                curveToRelative(0f, -5.333f, -8f, -5.333f, -8f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 7f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 21f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 13f)
                horizontalLineToRelative(10f)
            }
}

public val LucideIcons.All.PoundSterlingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PoundSterling: ImageVector
    @Composable get() = PoundSterlingDefinition.asImageVector()
