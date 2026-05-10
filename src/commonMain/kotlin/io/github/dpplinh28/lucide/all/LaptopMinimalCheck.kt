package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LaptopMinimalCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 20f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 10f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.LaptopMinimalCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LaptopMinimalCheck: ImageVector
    @Composable get() = LaptopMinimalCheckDefinition.asImageVector()
