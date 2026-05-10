package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Plug2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 2f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 2f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 8f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 11f)
                verticalLineTo(8f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                arcToRelative(6f, 6f, 0f, true, true, -12f, 0f)
                close()
            }
}

public val LucideIcons.All.Plug2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Plug2: ImageVector
    @Composable get() = Plug2Definition.asImageVector()
