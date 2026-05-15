package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CodeXml") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(18f, 16f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 8f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.5f, 4f)
                lineToRelative(-5f, 16f)
            }
}

public val LucideIcons.All.CodeXmlDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CodeXml: ImageVector
    @Composable get() = CodeXmlDefinition.asImageVector()
