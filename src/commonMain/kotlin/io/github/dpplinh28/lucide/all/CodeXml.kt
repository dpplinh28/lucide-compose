package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
