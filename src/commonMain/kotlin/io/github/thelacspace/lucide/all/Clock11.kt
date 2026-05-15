package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Clock11") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(6f)
                lineToRelative(-2f, -4f)
            }
}

public val LucideIcons.All.Clock11Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Clock11: ImageVector
    @Composable get() = Clock11Definition.asImageVector()
