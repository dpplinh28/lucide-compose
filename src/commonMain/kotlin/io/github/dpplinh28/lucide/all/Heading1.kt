package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading1") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 18f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 12f)
                lineToRelative(3f, -2f)
                verticalLineToRelative(8f)
            }
}

public val LucideIcons.All.Heading1Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading1: ImageVector
    @Composable get() = Heading1Definition.asImageVector()
