package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Type") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 7f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 20f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.TypeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Type: ImageVector
    @Composable get() = TypeDefinition.asImageVector()
