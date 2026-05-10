package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading3") { strokeWidth ->
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
                moveTo(17.5f, 10.5f)
                curveToRelative(1.7f, -1f, 3.5f, 0f, 3.5f, 1.5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 17.5f)
                curveToRelative(2f, 1.5f, 4f, .3f, 4f, -1.5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
            }
}

public val LucideIcons.All.Heading3Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading3: ImageVector
    @Composable get() = Heading3Definition.asImageVector()
