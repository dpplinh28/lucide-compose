package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudUpload") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 14.899f)
                arcTo(7f, 7f, 0f, true, true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 2.5f, 8.242f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 17f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
}

public val LucideIcons.All.CloudUploadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudUpload: ImageVector
    @Composable get() = CloudUploadDefinition.asImageVector()
