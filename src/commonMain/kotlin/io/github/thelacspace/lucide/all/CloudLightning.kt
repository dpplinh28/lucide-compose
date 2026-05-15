package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudLightning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 16.326f)
                arcTo(7f, 7f, 0f, true, true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, .5f, 8.973f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13f, 12f)
                lineToRelative(-3f, 5f)
                horizontalLineToRelative(4f)
                lineToRelative(-3f, 5f)
            }
}

public val LucideIcons.All.CloudLightningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudLightning: ImageVector
    @Composable get() = CloudLightningDefinition.asImageVector()
