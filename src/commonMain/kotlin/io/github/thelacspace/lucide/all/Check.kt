package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Check") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 6f)
                lineTo(9f, 17f)
                lineToRelative(-5f, -5f)
            }
}

public val LucideIcons.All.CheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Check: ImageVector
    @Composable get() = CheckDefinition.asImageVector()
