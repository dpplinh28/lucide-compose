package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CheckCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 6f)
                lineTo(7f, 17f)
                lineToRelative(-5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 10f)
                lineToRelative(-7.5f, 7.5f)
                lineTo(13f, 16f)
            }
}

public val LucideIcons.All.CheckCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CheckCheck: ImageVector
    @Composable get() = CheckCheckDefinition.asImageVector()
