package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Laptop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8.526f)
                arcToRelative(2f, 2f, 0f, false, false, .212f, .897f)
                lineToRelative(1.068f, 2.127f)
                arcToRelative(1f, 1f, 0f, false, true, -.9f, 1.45f)
                horizontalLineTo(3.62f)
                arcToRelative(1f, 1f, 0f, false, true, -.9f, -1.45f)
                lineToRelative(1.068f, -2.127f)
                arcTo(2f, 2f, 0f, false, false, 4f, 15.526f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.054f, 15.987f)
                horizontalLineTo(3.946f)
            }
}

public val LucideIcons.All.LaptopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Laptop: ImageVector
    @Composable get() = LaptopDefinition.asImageVector()
