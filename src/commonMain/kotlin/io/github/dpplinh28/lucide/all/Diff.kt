package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Diff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 10f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                horizontalLineToRelative(14f)
            }
}

public val LucideIcons.All.DiffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Diff: ImageVector
    @Composable get() = DiffDefinition.asImageVector()
