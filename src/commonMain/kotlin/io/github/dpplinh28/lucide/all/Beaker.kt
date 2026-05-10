package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Beaker") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.5f, 3f)
                horizontalLineToRelative(15f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 14f)
                horizontalLineToRelative(12f)
            }
}

public val LucideIcons.All.BeakerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Beaker: ImageVector
    @Composable get() = BeakerDefinition.asImageVector()
