package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                lineTo(12f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 6f)
                lineTo(12f, 10f)
                lineTo(8f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 15f)
                curveTo(2.6f, 15.5f, 3.2f, 16f, 4.5f, 16f)
                curveTo(7f, 16f, 7f, 14f, 9.5f, 14f)
                curveTo(12.1f, 14f, 11.9f, 16f, 14.5f, 16f)
                curveTo(17f, 16f, 17f, 14f, 19.5f, 14f)
                curveTo(20.8f, 14f, 21.4f, 14.5f, 22f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                curveTo(2.6f, 21.5f, 3.2f, 22f, 4.5f, 22f)
                curveTo(7f, 22f, 7f, 20f, 9.5f, 20f)
                curveTo(12.1f, 20f, 11.9f, 22f, 14.5f, 22f)
                curveTo(17f, 22f, 17f, 20f, 19.5f, 20f)
                curveTo(20.8f, 20f, 21.4f, 20.5f, 22f, 21f)
            }
}

public val LucideIcons.All.WavesArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesArrowDown: ImageVector
    @Composable get() = WavesArrowDownDefinition.asImageVector()
