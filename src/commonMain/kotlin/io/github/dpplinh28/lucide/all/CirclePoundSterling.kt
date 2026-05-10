package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CirclePoundSterling") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 16f)
                verticalLineTo(9.5f)
                arcToRelative(1f, 1f, 0f, false, true, 5f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 16f)
                horizontalLineToRelative(7f)
            }
}

public val LucideIcons.All.CirclePoundSterlingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CirclePoundSterling: ImageVector
    @Composable get() = CirclePoundSterlingDefinition.asImageVector()
