package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TableOfContents") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 5f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 19f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.TableOfContentsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TableOfContents: ImageVector
    @Composable get() = TableOfContentsDefinition.asImageVector()
