package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading4") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 10f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 10f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 18f)
                verticalLineTo(6f)
            }
}

public val LucideIcons.All.Heading4Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading4: ImageVector
    @Composable get() = Heading4Definition.asImageVector()
